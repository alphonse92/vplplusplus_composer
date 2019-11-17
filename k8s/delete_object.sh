
SERVICE=$1
ENVIRONMENT=$2
OBJECT=$3

BUILD_PATH="./build"
FULL_PATH="$BUILD_PATH/$SERVICE/$ENVIRONMENT/$OBJECT.yaml"
echo "checking $FULL_PATH ..."
if [ -f $FULL_PATH ];
then
  echo "Deleting object: $OBJECT"
  kubectl delete -f "$FULL_PATH"
else
  echo "Object: $OBJECT does not exist. Skiping."
fi
echo ""
