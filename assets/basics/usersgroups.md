# Users & Groups

## Create group
```[groupadd](/man/groupadd) [name]```
```[addgroup](/man/addgroup) [name]```

## Delete group
```[groupdel](/man/groupdel) [name]```

## Rename group
```[groupmod](/man/groupmod) -n [newGroupname] [oldGroupname]```

## Create user
```[useradd](/man/useradd) [name]```
```[adduser](/man/adduser) [name]```

## Delete user
```[userdel](/man/userdel) [name]```
```[deluser](/man/deluser) [name]```

## Rename user
```[usermod](/man/usermod) -l [newUsername] [oldUsername]```

## Set user password
```[passwd](/man/passwd) [name]```

## Grant sudo privileges to an existing user
```[usermod](/man/usermod) -a -G sudo [user]```
```[adduser](/man/adduser) [user] sudo```

## User information
```[finger](/man/finger) [user]```

## Add existing user to group
```[usermod](/man/usermod) -aG [groupName] [userName]```
```[adduser](/man/adduser) [userName] [groupName]```
```[gpasswd](/man/gpasswd) -a [userName] [groupName]```

## Add new user to group
```[useradd](/man/useradd) -G [group] [user]```

## Remove user from group
```[gpasswd](/man/gpasswd) -d [user] [group]```
```[deluser](/man/deluser) [user] [group]```

## List all groups
```[getent](/man/getent) group```
```[cat](/man/cat) /etc/group```

## List all users
```[getent](/man/getent) passwd```
```[cat](/man/cat) /etc/passwd```

## Show current user
```[whoami](/man/whoami)```

## Switch user
```[su](/man/su) [user]```

## Show logged-in users
```[who](/man/who)```
```[w](/man/w)```
```[users](/man/users)```

## Show user ID and groups
```[id](/man/id) [user]```

## Show login history
```[last](/man/last)```