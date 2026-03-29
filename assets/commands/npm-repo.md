# TAGLINE

opens a package's repository page in a browser

# TLDR

**Open the repository for a package**

```npm repo [package-name]```

**Open the repository for the current project**

```npm repo```

**Open repositories for multiple packages**

```npm repo [package1] [package2]```

**Print the repository URL without opening a browser**

```npm repo [package-name] --no-browser```

# SYNOPSIS

**npm** **repo** [_packages_]

# PARAMETERS

_PACKAGES_
> One or more package names. If omitted, uses the current project's `package.json`.

**--browser** _BROWSER_
> Browser to open the URL with. Defaults to the system default (`open` on macOS, `start` on Windows, `xdg-open` on Linux).

**--no-browser**
> Print the repository URL to stdout instead of opening a browser.

**--help**
> Display help information.

# DESCRIPTION

**npm repo** guesses the repository URL for a package from the `repository` field in its `package.json`, then opens it in the configured browser. If no package name is supplied, it reads from the `package.json` in the current directory.

The browser used can be overridden with the `--browser` config option, or set globally via `npm config set browser [program]`. Passing `--no-browser` suppresses the browser and prints the URL instead.

# CAVEATS

If the package's `package.json` does not include a `repository` field, npm falls back to the package's page on the npm registry. A network connection is required to look up packages not installed locally.

# HISTORY

**npm repo** has been part of the npm CLI since early versions, providing quick access to package source code repositories.

# SEE ALSO

[npm](/man/npm)(1), [npm-home](/man/npm-home)(1), [npm-docs](/man/npm-docs)(1)

