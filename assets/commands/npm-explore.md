# TAGLINE

opens a subshell in a package directory

# TLDR

**Explore package directory**

```npm explore [package-name]```

**Run command in package**

```npm explore [package-name] -- [ls]```

**Explore and run script**

```npm explore [package-name] -- npm run build```

# SYNOPSIS

**npm** **explore** _package_ [-- _command_]

# PARAMETERS

_PACKAGE_
> Installed package to enter (looked up in **node_modules**).

_COMMAND_
> Command to run in the package directory. When supplied, the subshell exits as soon as the command finishes.

**--shell** _PATH_
> Shell to invoke. Default: **$SHELL**, or **bash** on POSIX, or **cmd.exe** on Windows.

# DESCRIPTION

**npm explore** spawns a subshell inside the directory of an installed package (typically under **node_modules**). It is useful for inspecting an installed package, manipulating git submodules within it, or running ad-hoc commands such as **npm run** scripts in the package context.

If you modify the package while exploring, the package is **not** rebuilt automatically — run **npm rebuild** _pkg_ afterwards to recompile native components and re-link binaries.

# CAVEATS

Opens an interactive subshell — type **exit** to return to the parent shell. Edits made under **node_modules** are wiped on the next **npm install**, so persist changes upstream when possible. Using **--** before the command is recommended so npm does not interpret the trailing arguments as its own flags.

# INSTALL

```pacman: sudo pacman -S npm```

```apk: sudo apk add npm```

```brew: brew install npm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1), [npm-ls](/man/npm-ls)(1), [npm-edit](/man/npm-edit)(1)

