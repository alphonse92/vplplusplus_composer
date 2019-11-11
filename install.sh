mkdir -p ./data/mysql/
mkdir -p ./data/moodle_data/
mkdir -p ./data/moodle/
mkdir -p ./data/mongo
git submodule update --init --recursive
git submodule foreach --recursive git fetch
git submodule foreach git merge origin master
