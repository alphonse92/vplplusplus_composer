mkdir -p ./data/mysql/
mkdir -p ./data/moodle_data/
mkdir -p ./data/moodle/
mkdir -p ./data/mongo

git submodule init
git submodule add git@github.com:alphonse92/docker-moodle.git
git submodule add git@github.com:alphonse92/vplplusplus_api.git
git submodule add git@github.com:alphonse92/vplplusplus_client.git
git submodule add git@github.com:alphonse92/vplplusplus_jail.git
git submodule add git@github.com:alphonse92/vplplusplus_jail_jlib.git
git submodule add git@github.com:alphonse92/vplplusplus_jlib.git
git submodule update --recursive
