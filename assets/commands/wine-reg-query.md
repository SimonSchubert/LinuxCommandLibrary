# TAGLINE

Display keys and values from the Wine registry

# TLDR

**Query** a key and list its values

```wine reg query [HKCU\Software\MyApp]```

**Query a single value** of a key

```wine reg query [HKCU\Software\MyApp] /v [Name]```

**Query the default (unnamed) value** of a key

```wine reg query [HKCU\Software\MyApp] /ve```

**Query** a key **recursively**, including all subkeys

```wine reg query [HKCU\Software\MyApp] /s```

# SYNOPSIS

**wine reg query** _key_ [**/v** _value_ | **/ve**] [**/s**]

# DESCRIPTION

**wine reg query** reads and prints the contents of a registry key inside a Wine prefix. It mirrors the Windows **reg query** command. With no value options, it lists the values stored directly under the given key.

For each value, the output shows its name, type, and data. Use **/s** to walk the entire subtree below the key, which is useful for inspecting an application's full configuration at once.

# PARAMETERS

**/v**  _value_
> Query the named value under the key.

**/ve**
> Query the key's default (unnamed) value.

**/s**
> Query all subkeys and their values recursively.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-reg](/man/wine-reg)(1), [wine-reg-add](/man/wine-reg-add)(1), [wine-reg-delete](/man/wine-reg-delete)(1), [wine-reg-copy](/man/wine-reg-copy)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org)```

<!-- verified: 2026-06-22 -->
