# TLDR

Update a user's **full name**

```chfn -f [new_display_name] [username]```

Update a user's **office room number**

```chfn -o [new_office_room_number] [username]```

Update a user's **office phone number**

```chfn -p [new_office_telephone_number] [username]```

Update a user's **home phone number**

```chfn -h [new_home_telephone_number] [username]```

# SYNOPSIS

**chfn** [_options_] [_username_]

# DESCRIPTION

**chfn** changes user information stored in the GECOS field of /etc/passwd. This information is displayed by the finger command and other utilities that show user details.

Users can change their own information; root can change any user's information.

# PARAMETERS

**-f, --full-name** _name_
> Set the user's full name

**-o, --office** _office_
> Set office room number

**-p, --office-phone** _phone_
> Set office phone number

**-h, --home-phone** _phone_
> Set home phone number

**-u, --help**
> Display help message

# CAVEATS

Some systems restrict which fields users can modify. The GECOS field has a maximum length limit. Changes require authentication unless run as root.

# HISTORY

The GECOS field originated from the General Electric Comprehensive Operating System, where it stored accounting information. Its use for user information became a Unix convention.

# SEE ALSO

[finger](/man/finger)(1), [passwd](/man/passwd)(1), [usermod](/man/usermod)(8)
