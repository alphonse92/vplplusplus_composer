mkdir -p ./data/mysql/
mkdir -p ./data/moodle_data/
mkdir -p ./data/moodle/
mkdir -p ./data/mongo
mkdir -p ./certs/

git submodule init

cd vplplusplus_api && npm install
cd ../vplplusplus_client && npm install

pip install "j2cli" 
pip install "j2cli[yaml]"

git submodule update --recursive
