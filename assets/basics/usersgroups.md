# Users & Groups

## Creating Users
**useradd** is the low-level tool: add **-m** to create a home directory and **-s** to set the login shell. On Debian-based systems, **adduser** is the friendlier interactive front end. All user and group administration requires root.
```[useradd](/man/useradd) -m -s /bin/bash [name]```
```[adduser](/man/adduser) [name]```
```[passwd](/man/passwd) [name]```

> Plain **useradd [name]** creates the account without a home directory, which is rarely what you want for a real user.

## Deleting & Renaming Users
**-r** also removes the user's home directory and mail spool.
```[userdel](/man/userdel) [name]```
```[userdel](/man/userdel) -r [name]```
```[deluser](/man/deluser) [name]```
```[usermod](/man/usermod) -l [newUsername] [oldUsername]```

## Modifying Users
Change a user's shell, home directory, or comment field.
```[usermod](/man/usermod) -s /bin/zsh [name]```
```[chsh](/man/chsh) -s /bin/zsh [name]```
```[usermod](/man/usermod) -d /new/home -m [name]```

Lock an account (disables password login) and unlock it again.
```[usermod](/man/usermod) -L [name]```
```[usermod](/man/usermod) -U [name]```

Force a password change at next login, or inspect password aging.
```[passwd](/man/passwd) -e [name]```
```[chage](/man/chage) -l [name]```

## Groups
Create, rename, and delete groups.
```[groupadd](/man/groupadd) [name]```
```[groupmod](/man/groupmod) -n [newGroupname] [oldGroupname]```
```[groupdel](/man/groupdel) [name]```

Add an existing user to a group. The **-a** in **-aG** is essential: without it, the user is removed from all other supplementary groups.
```[usermod](/man/usermod) -aG [groupName] [userName]```
```[gpasswd](/man/gpasswd) -a [userName] [groupName]```
```[adduser](/man/adduser) [userName] [groupName]```

Remove a user from a group.
```[gpasswd](/man/gpasswd) -d [userName] [groupName]```
```[deluser](/man/deluser) [userName] [groupName]```

> Group changes take effect at the next login. Use **newgrp [groupName]** to activate one in the current shell without logging out.

## Granting sudo
Membership in the admin group grants sudo rights: the group is **sudo** on Debian/Ubuntu and **wheel** on Fedora, RHEL, and Arch.
```[usermod](/man/usermod) -aG sudo [user]```
```[usermod](/man/usermod) -aG wheel [user]```

Edit the sudoers file only with **visudo**, which checks the syntax before saving (a broken sudoers file can lock you out).
```[visudo](/man/visudo)```

## Listing Users & Groups
**getent** queries all account databases, including LDAP and other network sources; the /etc files only show local accounts.
```[getent](/man/getent) passwd```
```[getent](/man/getent) group```
```[cat](/man/cat) /etc/passwd```
```[cat](/man/cat) /etc/group```

## Who Am I, Who Is Here
Show the current user, their IDs and groups, and the groups of any user.
```[whoami](/man/whoami)```
```[id](/man/id) [user]```
```[groups](/man/groups) [user]```

See who is logged in and what they are doing, and the login history.
```[who](/man/who)```
```[w](/man/w)```
```[last](/man/last)```

## Switching Users
**su -** starts a full login shell as another user (root if no name is given); **sudo -i** opens a root shell via sudo.
```[su](/man/su) - [user]```
```[sudo](/man/sudo) -i```
```[sudo](/man/sudo) -u [user] [command]```
