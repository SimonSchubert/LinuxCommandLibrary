# TAGLINE

Get and set values in INI-style config files

# TLDR

**Get** a parameter

```crudini --get [file.ini] [section] [param]```

**Set** a parameter

```crudini --set [file.ini] [section] [param] [value]```

**Delete** a parameter

```crudini --del [file.ini] [section] [param]```

**Merge** INI from stdin into a file

```crudini --merge [file.ini] < [snippet.ini]```

**Set** a global (no section) parameter

```crudini --set [file.ini] "" [param] [value]```

# SYNOPSIS

**crudini** **--set**|**--get**|**--del**|**--merge** [*options*] *config_file* ...

# DESCRIPTION

**crudini** manipulates INI configuration files from the shell: get/set/delete parameters, operate on sections, and merge fragments. Useful in provisioning scripts that must edit **.ini** files without brittle **sed**. Requires Python **iniparse**.

# PARAMETERS

**--get** *file* [*section*] [*param*]

> Read a value or list sections/keys.

**--set** *file* *section* [*param*] [*value*]

> Create/update a value. Empty section **""** targets global keys.

**--del** *file* *section* [*param*]

> Remove a parameter or section.

**--merge** *file* [*section*]

> Merge INI data from stdin.

**--existing**

> Fail if the item does not already exist.

Multiple operations can be combined per invocation; see **crudini --help**.

# CAVEATS

INI dialects differ (duplicate keys, multiline, nested sections). Always test on copies of production configs. Not a general TOML/YAML editor.

# INSTALL

```apt: sudo apt install crudini```

```dnf: sudo dnf install crudini```

```zypper: sudo zypper install crudini```

```nix: nix profile install nixpkgs#crudini```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[augtool](/man/augtool)(1), [sed](/man/sed)(1), [git-config](/man/git-config)(1)

# RESOURCES

```[Source code](https://github.com/pixelb/crudini)```

<!-- verified: 2026-07-19 -->
