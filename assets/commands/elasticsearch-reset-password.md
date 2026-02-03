# TLDR

**Reset elastic user password**

```elasticsearch-reset-password -u elastic```

**Reset with auto-generated password**

```elasticsearch-reset-password -u [username] -a```

**Reset interactively**

```elasticsearch-reset-password -u [username] -i```

**Specify batch mode**

```elasticsearch-reset-password -u [username] -b```

# SYNOPSIS

**elasticsearch-reset-password** **-u** _username_ [_options_]

# PARAMETERS

**-u**, **--username** _user_
> Username to reset.

**-a**, **--auto**
> Auto-generate password.

**-i**, **--interactive**
> Prompt for new password.

**-b**, **--batch**
> Run in batch mode.

**--url** _url_
> Elasticsearch URL.

**-E** _setting=value_
> Override configuration.

# DESCRIPTION

**elasticsearch-reset-password** resets passwords for Elasticsearch built-in users. Can auto-generate or interactively set new passwords.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-users](/man/elasticsearch-users)(1)

