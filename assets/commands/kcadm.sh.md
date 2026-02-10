# TAGLINE

keycloak Admin CLI

# TLDR

**Login to Keycloak**

```kcadm.sh config credentials --server [url] --realm [master] --user [admin]```

**Create realm**

```kcadm.sh create realms -s realm=[name] -s enabled=true```

**Create user**

```kcadm.sh create users -r [realm] -s username=[user] -s enabled=true```

**Get users**

```kcadm.sh get users -r [realm]```

**Update user**

```kcadm.sh update users/[id] -r [realm] -s email=[email]```

**Set password**

```kcadm.sh set-password -r [realm] --username [user] --new-password [pass]```

# SYNOPSIS

**kcadm.sh** _command_ [_options_]

# PARAMETERS

**config credentials**
> Configure authentication.

**create** _RESOURCE_
> Create resource.

**get** _RESOURCE_
> Get resource(s).

**update** _RESOURCE_
> Update resource.

**delete** _RESOURCE_
> Delete resource.

**-r** _REALM_
> Target realm.

**-s** _ATTR=VALUE_
> Set attribute.

**--help**
> Display help information.

# DESCRIPTION

**kcadm.sh** is the Keycloak Admin CLI. It manages Keycloak identity and access management configurations.

The tool provides full administrative access to Keycloak. It creates users, realms, clients, and roles.

# CAVEATS

Requires Java. Keycloak must be running. Admin credentials needed.

# HISTORY

kcadm.sh is the official admin CLI for **Keycloak**, the open-source identity and access management solution.

# SEE ALSO

[keycloak](/man/keycloak)(1), [curl](/man/curl)(1)
