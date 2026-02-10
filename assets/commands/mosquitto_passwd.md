# TAGLINE

manages password files for the Mosquitto MQTT broker

# TLDR

**Create password file with user**

```mosquitto_passwd -c [passwordfile] [username]```

**Add user to existing file**

```mosquitto_passwd [passwordfile] [username]```

**Delete user**

```mosquitto_passwd -D [passwordfile] [username]```

**Batch mode with password**

```mosquitto_passwd -b [passwordfile] [username] [password]```

# SYNOPSIS

**mosquitto_passwd** [_options_] _passwordfile_ [_username_]

# PARAMETERS

**-c**
> Create new password file.

**-D**
> Delete user from file.

**-b**
> Batch mode, password on command line.

**-U**
> Upgrade plain text file to hashed.

# DESCRIPTION

**mosquitto_passwd** manages password files for the Mosquitto MQTT broker. Creates and modifies password entries with secure hashing. Used for client authentication in MQTT messaging systems.

# CAVEATS

Avoid **-b** flag in scripts as passwords may appear in process listings. Use interactive mode or pipe from secure sources.

# SEE ALSO

[mosquitto](/man/mosquitto)(1), [mosquitto_sub](/man/mosquitto_sub)(1), [mosquitto_pub](/man/mosquitto_pub)(1)

