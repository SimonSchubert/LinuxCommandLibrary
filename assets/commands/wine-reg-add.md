# TAGLINE

Add a key or value to the Wine registry

# TLDR

**Create** a registry key

```wine reg add [HKCU\Software\MyApp]```

**Add a string value** to a key

```wine reg add [HKCU\Software\MyApp] /v [Name] /t [REG_SZ] /d [value]```

**Add a DWORD value**

```wine reg add [HKCU\Software\MyApp] /v [Enabled] /t [REG_DWORD] /d [1]```

**Set the default (unnamed) value** of a key

```wine reg add [HKCU\Software\MyApp] /ve /d [default]```

**Overwrite** an existing value **without prompting**

```wine reg add [HKCU\Software\MyApp] /v [Name] /d [new] /f```

# SYNOPSIS

**wine reg add** _key_ [**/v** _value_ | **/ve**] [**/t** _type_] [**/s** _separator_] [**/d** _data_] [**/f**]

# DESCRIPTION

**wine reg add** creates a registry key inside a Wine prefix, or adds (or overwrites) a value within an existing key. It mirrors the behavior of the Windows **reg add** command. With no value options, it simply ensures the named key exists.

A value is described by its name (**/v**), its type (**/t**), and its data (**/d**). The default type is **REG_SZ** (a string). When the named value already exists, reg add prompts before overwriting unless **/f** is given.

# PARAMETERS

**/v**  _value_
> Name of the value to add under the key.

**/ve**
> Add or set the key's default (unnamed) value.

**/t**  _type_
> Data type of the value, such as **REG_SZ**, **REG_EXPAND_SZ**, **REG_MULTI_SZ**, **REG_DWORD**, **REG_BINARY**, or **REG_NONE**. Defaults to **REG_SZ**.

**/s**  _separator_
> Character used to separate the elements of a **REG_MULTI_SZ** value. Defaults to **\0**.

**/d**  _data_
> The data to store in the value.

**/f**
> Force the operation, overwriting an existing value without a confirmation prompt.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-reg](/man/wine-reg)(1), [wine-reg-delete](/man/wine-reg-delete)(1), [wine-reg-query](/man/wine-reg-query)(1), [wine-reg-copy](/man/wine-reg-copy)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org)```

<!-- verified: 2026-06-22 -->
