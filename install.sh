mkdir -p ./data/mysql/
mkdir -p ./data/moodle_data/
mkdir -p ./data/moodle/
mkdir -p ./data/mongo
mdirk -p ./certs/

git submodule init
git submodule add git@github.com:alphonse92/docker-moodle.git
git submodule add git@github.com:alphonse92/vplplusplus_api.git
git submodule add git@github.com:alphonse92/vplplusplus_client.git
git submodule add git@github.com:alphonse92/vplplusplus_jail.git
git submodule add git@github.com:alphonse92/vplplusplus_jail_jlib.git
git submodule add git@github.com:alphonse92/vplplusplus_jlib.git

cd vplplusplus_api && npm install
cd ../vplplusplus_client && npm install

pip install "j2cli" "j2cli[yaml]"

git submodule update --recursive
