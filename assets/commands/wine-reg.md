# TAGLINE

Read and modify the Wine registry from the command line

# TLDR

**Add** a value to a registry key

```wine reg add [HKCU\Software\MyApp] /v [Setting] /t [REG_SZ] /d [value] /f```

**Query** a key and its values

```wine reg query [HKCU\Software\MyApp]```

**Delete** a value from a key

```wine reg delete [HKCU\Software\MyApp] /v [Setting] /f```

**Copy** a key (with subkeys) to another location

```wine reg copy [HKCU\Software\MyApp] [HKCU\Software\MyAppBackup] /s /f```

**Import** registry entries from a .reg file

```wine reg import [file.reg]```

**Export** a key to a .reg file

```wine reg export [HKCU\Software\MyApp] [file.reg]```

# SYNOPSIS

**wine reg** _operation_ _key_ [_options_]

operation := **add** | **delete** | **query** | **copy** | **import** | **export**

# DESCRIPTION

**wine reg** is Wine's reimplementation of the Windows **reg.exe** console tool. It lets you inspect and edit the registry of a Wine prefix without launching the graphical **regedit**, which is handy for scripting installers, applying tweaks in a Wineprefix, and automating application configuration.

Registry keys are addressed by their root and path, for example **HKEY_CURRENT_USER\Software\MyApp**. The standard root abbreviations are accepted: **HKLM** (HKEY_LOCAL_MACHINE), **HKCU** (HKEY_CURRENT_USER), **HKCR** (HKEY_CLASSES_ROOT), **HKU** (HKEY_USERS), and **HKCC** (HKEY_CURRENT_CONFIG).

The tool operates on the registry of the prefix named by the **WINEPREFIX** environment variable (defaulting to **~/.wine**). Each operation is a separate subcommand documented in its own page.

# OPERATIONS

**add**
> Create a key, or add or overwrite a value within it.

**delete**
> Remove a key, a single value, or all values under a key.

**query**
> Display the values stored under a key, optionally recursing into subkeys.

**copy**
> Copy a key's values (and optionally its subkeys) to another key.

**import**
> Merge the contents of a .reg file into the registry.

**export**
> Write a key and its contents to a .reg file.

# CAVEATS

Backslashes in key paths may need quoting or escaping depending on your shell. Editing the registry of the wrong prefix is a common mistake; set **WINEPREFIX** explicitly when you maintain more than one. As with the native Windows tool, careless changes can break applications, so back up keys with **export** before modifying them.

# SEE ALSO

[wine](/man/wine)(1), [reg](/man/reg)(1), [wine-reg-add](/man/wine-reg-add)(1), [wine-reg-delete](/man/wine-reg-delete)(1), [wine-reg-query](/man/wine-reg-query)(1), [wine-reg-copy](/man/wine-reg-copy)(1)

# RESOURCES

```[Source code](https://gitlab.winehq.org/wine/wine)```

```[Homepage](https://www.winehq.org)```

```[Documentation](https://gitlab.winehq.org/wine/wine/-/wikis/home)```

<!-- verified: 2026-06-22 -->
