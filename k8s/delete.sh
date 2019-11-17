
SERVICE=$1
ENVIRONMENT=$2
OBJECT=$3

BUILD_PATH="./build"
FULL_PATH="$BUILD_PATH/$SERVICE/$ENVIRONMENT/$OBJECT.yaml"
if [ -f $FULL_PATH ];
then
  echo "Deploying $OBJECT"
  kubectl delete -f "$FULL_PATH"
else
  echo "File: $OBJECT does not exist. Skiping."
fi
