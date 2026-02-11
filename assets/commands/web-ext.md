# TAGLINE

Firefox WebExtension development tool

# TLDR

**Run extension in Firefox**

```web-ext run```

**Run in specific Firefox**

```web-ext run --firefox=[/path/to/firefox]```

**Build extension**

```web-ext build```

**Lint extension**

```web-ext lint```

**Sign extension**

```web-ext sign --api-key=[key] --api-secret=[secret]```

**Run from specific directory**

```web-ext run -s [extension/]```

**Run with verbose output**

```web-ext run -v```

# SYNOPSIS

**web-ext** _command_ [_--source-dir dir_] [_options_]

# PARAMETERS

**run**
> Run in browser.

**build**
> Package extension.

**lint**
> Check for issues.

**sign**
> Sign for distribution.

**-s**, **--source-dir** _DIR_
> Extension source.

**--firefox** _PATH_
> Firefox binary.

**-v**, **--verbose**
> Verbose output.

**--api-key** _KEY_
> AMO API key.

**--api-secret** _SECRET_
> AMO API secret.

# DESCRIPTION

**web-ext** is Mozilla's official command-line tool for developing, testing, and publishing Firefox WebExtensions. It streamlines the extension development workflow by providing commands for running, building, linting, and signing extensions.

The run command launches Firefox with the extension temporarily loaded and automatically reloads it when source files change, enabling rapid development iteration. The build command packages the extension into a .zip file ready for submission to addons.mozilla.org (AMO), and the lint command checks for common issues like manifest errors and deprecated API usage.

The sign command submits the extension to Mozilla for signing, which is required for distribution outside AMO. Authentication requires an AMO API key and secret obtained from the Firefox developer portal.

# CAVEATS

Firefox-specific tool. Signing needs AMO account. Some features need Nightly.

# HISTORY

**web-ext** was created by **Mozilla** for WebExtension development. It simplifies the extension development workflow.

# SEE ALSO

[firefox](/man/firefox)(1), [npm](/man/npm)(1)
