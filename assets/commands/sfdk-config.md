# TAGLINE

Manage Sailfish SDK configuration settings

# TLDR

**Show current configuration**

```sfdk config --show```

**Set the build target for this session**

```sfdk config target=[target_name]```

**Set the default device globally**

```sfdk config --global --push device [device_name]```

**Set the SPEC file to use**

```sfdk config specfile=[path/to/file.spec]```

**Mask an option set at an outer scope**

```sfdk config [option_name]=```

**Drop a previously pushed option**

```sfdk config --drop [option_name]```

# SYNOPSIS

**sfdk config** [**--show**]

**sfdk config** [**--**_scope_] **--push** _name_ [_value_]

**sfdk config** [**--**_scope_] **--push-mask** _name_

**sfdk config** [**--**_scope_] **--drop** _name_

**sfdk config** [**--**_scope_] _name_[**=**[_value_]]

# PARAMETERS

**--show**
> Show the current configuration.

**--global**, **--session**
> Select the scope to operate on. The default is **session**.

**--push** _name_ [_value_]
> Push an option onto the configuration stack.

**--push-mask** _name_
> Mask the option without setting it at this scope.

**--drop** _name_
> Remove the option from the scope.

# DESCRIPTION

**sfdk config** manages the Sailfish SDK configuration, which is stack based: options higher on the stack may override earlier ones. Three scopes exist: **global** (outermost), **session**, and **command**. Session settings last for the rest of the current shell session. The non-persistent **command** scope can only be modified with the global **-c** option. Part of the Sailfish SDK command-line tool.

The shorthand _name_**=**_value_ is equivalent to **--push** _name_ _value_, and _name_**=** is equivalent to **--push-mask** _name_.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-device](/man/sfdk-device)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
