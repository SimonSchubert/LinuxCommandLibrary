# TAGLINE

displays detailed information about user accounts on a Linux system including

# TLDR

Display **all users**

```lslogins```

Display users in **specific group**

```lslogins --groups [group]```

Display **user accounts** only

```lslogins --user-accs```

Display **system accounts**

```lslogins --system-accs```

Display **last logins**

```lslogins --last```

Display **supplementary groups**

```lslogins --supp-groups```

# SYNOPSIS

**lslogins** [_options_] [_username_...]

# DESCRIPTION

**lslogins** displays detailed information about user accounts on a Linux system including login times, password status, and group memberships. It provides more detail than traditional tools like who or w.

# PARAMETERS

**-g, --groups GROUPS**
> Show users in specified groups

**-u, --user-accs**
> Show user (non-system) accounts only

**-s, --system-accs**
> Show system accounts only

**-L, --last**
> Show last login information

**-G, --supp-groups**
> Show supplementary groups

**-o, --output COLUMNS**
> Specify output columns

**-r, --raw**
> Raw output format

**-n, --noheadings**
> Suppress column headers

# SEE ALSO

[who](/man/who)(1), [last](/man/last)(1), [id](/man/id)(1), [getent](/man/getent)(1)
