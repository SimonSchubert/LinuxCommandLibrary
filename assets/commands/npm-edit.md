# TAGLINE

open an installed package's directory in the default editor

# TLDR

**Edit an installed package**

```npm edit [package]```

**Edit a nested subpackage**

```npm edit [package]/[subpackage]```

**Edit with a specific editor**

```EDITOR=[vim] npm edit [package]```

**Configure the default editor** persistently

```npm config set editor [code]```

# SYNOPSIS

**npm edit** _pkg_[**/**_subpkg_...]

# DESCRIPTION

**npm edit** opens an installed package's directory in the default editor so it can be inspected or modified in place under `node_modules`. After the editor exits, npm rebuilds the package so any changes (for example to native addons) take effect.

The editor is taken from the npm **editor** config, which defaults to the **EDITOR** or **VISUAL** environment variables (or `notepad.exe` on Windows, `vi` on Unix).

# PARAMETERS

_pkg_
> Name of the dependency to edit.

**/**_subpkg_
> Optional nested package path, to drill into a transitive dependency under `node_modules`.

**editor** (config)
> Editor used to open the package. Set with `npm config set editor <name>` or via **EDITOR**/**VISUAL**.

# CAVEATS

Changes made to files in `node_modules` are lost the next time npm reinstalls or updates the package. For persistent local modifications use **patch-package** or fork the package upstream. **npm edit** is not workspace-aware: in a workspace it operates on the root `node_modules`.

# HISTORY

**npm edit** has been part of **npm** since early releases, providing a quick way to read or hack on installed dependencies during debugging.

# SEE ALSO

[npm](/man/npm)(1), [npm-explore](/man/npm-explore)(1)
