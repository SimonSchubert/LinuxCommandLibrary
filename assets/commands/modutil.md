# TAGLINE

manages PKCS#11 security modules in NSS databases

# TLDR

**List modules**

```modutil -list -dbdir [sql:/etc/pki/nssdb]```

**Add module**

```modutil -add [module_name] -libfile [/path/to/lib.so] -dbdir [sql:/etc/pki/nssdb]```

**Delete module**

```modutil -delete [module_name] -dbdir [sql:/etc/pki/nssdb]```

**Enable module**

```modutil -enable [module_name] -dbdir [sql:/etc/pki/nssdb]```

# SYNOPSIS

**modutil** [_options_]

# PARAMETERS

**-list**
> List installed modules.

**-add** _name_
> Add PKCS#11 module.

**-delete** _name_
> Remove module.

**-enable** _name_
> Enable module.

**-disable** _name_
> Disable module.

**-libfile** _path_
> Module library path.

**-dbdir** _dir_
> NSS database directory.

# DESCRIPTION

**modutil** manages PKCS#11 security modules in NSS databases. Add, remove, and configure hardware tokens and software modules. Part of Mozilla NSS tools.

# SEE ALSO

[certutil](/man/certutil)(1), [pk12util](/man/pk12util)(1)

