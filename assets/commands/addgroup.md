# TAGLINE

Create groups and manage group membership

# TLDR

**Create** a new group

```sudo addgroup [groupname]```

Create a **system** group

```sudo addgroup --system [groupname]```

Add a **user** to an existing group

```sudo addgroup [username] [groupname]```

Create group with **specific GID**

```sudo addgroup --gid [1001] [groupname]```

# SYNOPSIS

**addgroup** [_options_] _group_

**addgroup** [_options_] _user_ _group_

# DESCRIPTION

**addgroup** is a Debian/Ubuntu friendly frontend to the low-level **groupadd** command. It creates new groups or adds existing users to groups, following the naming policies and conventions defined in adduser.conf.

When adding a user to a group, it modifies /etc/group to include the user as a member. This is the recommended way to manage group membership on Debian-based systems.

# PARAMETERS

**--gid** _id_
> Specify the group ID (GID) for the new group

**--system**
> Create a system group (GID from system range)

**--force-badname**
> Allow group names that don't conform to naming conventions

**--conf** _file_
> Use alternate configuration file

**--quiet**
> Suppress informational messages

**--debug**
> Print debug information

# CONFIGURATION

**/etc/adduser.conf**
> Controls default behavior for addgroup and adduser, including GID ranges for normal and system groups, naming policies, and group creation defaults.

# CAVEATS

Group names must follow naming rules defined in adduser.conf. System groups typically have GIDs below 1000. Users must log out and back in for new group memberships to take effect.

# HISTORY

**addgroup** was created as part of the adduser package for Debian, providing a user-friendly interface for group management that follows distribution policies. It has been part of Debian since the mid-**1990s**.

# SEE ALSO

[groupadd](/man/groupadd)(8), [adduser](/man/adduser)(8), [delgroup](/man/delgroup)(8), [groups](/man/groups)(1)
