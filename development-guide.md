# Development guide

This guide provides util information that could be helpfull while you develop for vpl ++

## Setup development environment

### Import development database

**Warning** This database contains the database structure for a single moodle with only vpl plugin.

You can import a development database using mysql. Find in: `docs/files/mysql-database`.



## About Docker compose containers and volumes

There exist different ways to persist information. For example: volumes. You can set a volume to persist
the mongo database info or mysql database. In mongo case, it creates a private volume to persist it data.

### Do you change the user admin and password after init?

Run 

```
docker-compose down --volumes
```

It should erase the volumes.

### Cant connect to mongodb

A mongo url looks like:

1. If you are using password: ```mongodb://${YOUR_USERNAME}:${YOUR_PASSWORD}@${HOST_WHERE_IS_YOUR_DATABASE}:${DATABASE_PORT}/${YOUR_DATABASE_NAME}l?authSource=admin```

2. without passworD `mongodb://localhost:27017/api-dev`

if you cant connect to the database yet, remove the docker volume for mongo. (see step above)


# Delopmenmt Notes

Passwords for all the users is Passw0rd*

## Users Structure

Create the next estructure on your moodle system to test the resources access

### administrators
admin: alejandromover92+vpladmin@gmail.com admin

### Ingenieria de sistemas

#### Programación Orientada a Objetos 1 curso 1

| type    | email                                          | username  | password  |   |
|---------|------------------------------------------------|-----------|-----------|---|
| teacher | alejandromover92+vplteachereliecer@gmail.com   | eliecer   | Passw0rd* |   |
| student | alejandromover92+vplstudentalejandro@gmail.com | alejandro | Passw0rd* |   |
| student | alejandromover92+vplstudentcamilo@gmail.com    | camilo    | Passw0rd* |   |
| student | alejandromover92+vplstudent1@gmail.com         | student01 | Passw0rd* |   |
| student | alejandromover92+vplstudent2@gmail.com         | student02 | Passw0rd* |   |
| student | alejandromover92+vplstudent3@gmail.com         | student03 | Passw0rd* |   |
| student | alejandromover92+vplstudent4@gmail.com         | student04 | Passw0rd* |   |
| student | alejandromover92+vplstudent5@gmail.com         | student05 | Passw0rd* |   |
| student | alejandromover92+vplstudent6@gmail.com         | student06 | Passw0rd* |   |
| student | alejandromover92+vplstudent7@gmail.com         | student07 | Passw0rd* |   |
| student | alejandromover92+vplstudent8@gmail.com         | student08 | Passw0rd* |   |
| student | alejandromover92+vplstudent9@gmail.com         | student09 | Passw0rd* |   |


#### Programación Orientada a Objetos 1 curso 1

| type    | email                                         | username | password  |   |
|---------|-----------------------------------------------|----------|-----------|---|
| teacher | alejandromover92+vplteachereliecer2@gmail.com | eliecer2 | Passw0rd* |   |
| student | alejandromover92+vplstudentcamilo2@gmail.com  | camilo2  | Passw0rd* |   |


### Ingenieria civil

#### Quimica

| type    | email                                         | username | password  |   |
|---------|-----------------------------------------------|----------|-----------|---|
| teacher | alejandromover92+vplteacheralexa@gmail.com    | alexa    | Passw0rd* |   |
| student | alejandromover92+vplstudentsantiago@gmail.com | santiago | Passw0rd* |   |
|         |                                               |          |           |   |

# Moodle activity arquitecture and references

Moodle plugins are knowed as "module" each plugin has them own tables. The table name of each plugin can be called as it is, sure, with the table sufix. For VPL the table is mdl_vpl (if the sufix is mdl_).

Each course in moodle is called course, there is a table to related course with an module activity, this table is called mdl_course_module. In the other hand, each course can group them course modules in sections to be more descriptive.

In some tables there is a column (or attribute) called moduleid, that field is RELATED TO mdl_course_module NOT TO THE MODULE TABLE

Each course module (or course activity) belongs to a section an a course. Each row in mdl_course_module has references to a module (for example vpl), to a section and to a course.


# Backup strategy

Moodle can create backups of moodle courses. When you create a moodle backup you can select the course items, for example sections, activities (from a module, for example vpl) and more. Moodle generate a gziped file, that you can open using winrar, winzip, or 7zip. If you like to see the moodle files of moodle backup you just add the extension tgz.

## Backup files.

There are a lot of files, folders inside the backup file, but, the api just focus in a single activity. 
```
backup.mbz
 |_ activities
   |_ $MODULE_$COURSEID
     |_vpl.xml (this file contains the vpl activity information, for example the execution files)
 |_moodle_backup.xml
```

These files contains metadata to track and build the activity from a course.
