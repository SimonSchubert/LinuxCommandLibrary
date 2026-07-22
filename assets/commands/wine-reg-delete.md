# TAGLINE

Delete a key or value from the Wine registry

# TLDR

**Delete** a registry key and everything under it

```wine reg delete [HKCU\Software\MyApp]```

**Delete a single value** from a key

```wine reg delete [HKCU\Software\MyApp] /v [Name]```

**Delete the default (unnamed) value** of a key

```wine reg delete [HKCU\Software\MyApp] /ve```

**Delete all values** under a key but keep the key itself

```wine reg delete [HKCU\Software\MyApp] /va```

**Delete** a key **without a confirmation prompt**

```wine reg delete [HKCU\Software\MyApp] /f```

# SYNOPSIS

**wine reg delete** _key_ [**/v** _value_ | **/ve** | **/va**] [**/f**]

# DESCRIPTION

**wine reg delete** removes a registry key, a single value, or all values within a key from a Wine prefix. It mirrors the Windows **reg delete** command. With no value options, the entire key and all of its subkeys and values are removed.

By default the command prompts for confirmation before deleting. Use **/f** to suppress the prompt, which is required when running non-interactively in scripts.

# PARAMETERS

**/v**  _value_
> Delete the named value under the key.

**/ve**
> Delete the key's default (unnamed) value.

**/va**
> Delete all values under the key while leaving the key and its subkeys intact.

**/f**
> Force the deletion without a confirmation prompt.

# CAVEATS

Deleting a key without specifying a value also removes every subkey beneath it. There is no undo, so export the key first with **wine reg export** if you might need to restore it.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-reg](/man/wine-reg)(1), [wine-reg-add](/man/wine-reg-add)(1), [wine-reg-query](/man/wine-reg-query)(1), [wine-reg-copy](/man/wine-reg-copy)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org)```

<!-- verified: 2026-06-22 -->
