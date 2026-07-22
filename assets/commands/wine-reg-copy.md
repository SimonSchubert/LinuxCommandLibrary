# TAGLINE

Copy a key and its values within the Wine registry

# TLDR

**Copy** the values of one key to another

```wine reg copy [HKCU\Software\MyApp] [HKCU\Software\MyAppCopy]```

**Copy** a key **including all of its subkeys**

```wine reg copy [HKCU\Software\MyApp] [HKCU\Software\MyAppCopy] /s```

**Copy** a key, **overwriting the destination without prompting**

```wine reg copy [HKCU\Software\MyApp] [HKCU\Software\MyAppCopy] /f```

**Copy** an entire subtree **non-interactively**

```wine reg copy [HKCU\Software\MyApp] [HKCU\Software\MyAppCopy] /s /f```

# SYNOPSIS

**wine reg copy** _source_key_ _dest_key_ [**/s**] [**/f**]

# DESCRIPTION

**wine reg copy** duplicates the values of a registry key to another key inside a Wine prefix. It mirrors the Windows **reg copy** command. By default it copies only the values stored directly under the source key; with **/s** it also copies every subkey beneath it.

When a value already exists in the destination, the command prompts before overwriting it unless **/f** is supplied. The source and destination can be different keys within the same root or across different roots.

# PARAMETERS

**/s**
> Copy all subkeys and values under the source key, not just its immediate values.

**/f**
> Force the copy, overwriting existing destination values without a confirmation prompt.

# INSTALL

```dnf: sudo dnf install wine```

```pacman: sudo pacman -S wine```

```apk: sudo apk add wine```

```zypper: sudo zypper install wine```

```nix: nix profile install nixpkgs#wine```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[wine](/man/wine)(1), [wine-reg](/man/wine-reg)(1), [wine-reg-add](/man/wine-reg-add)(1), [wine-reg-delete](/man/wine-reg-delete)(1), [wine-reg-query](/man/wine-reg-query)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org)```

<!-- verified: 2026-06-22 -->
