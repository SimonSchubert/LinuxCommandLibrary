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

**web-ext** develops Firefox extensions. It runs, builds, and signs extensions.

Run mode launches Firefox with extension loaded. Auto-reloads on changes.

Building creates distribution zip. Ready for submission.

Linting checks for common issues. Manifest errors, deprecated APIs.

Signing submits to Mozilla. Required for distribution outside AMO.

# CAVEATS

Firefox-specific tool. Signing needs AMO account. Some features need Nightly.

# HISTORY

**web-ext** was created by **Mozilla** for WebExtension development. It simplifies the extension development workflow.

# SEE ALSO

[firefox](/man/firefox)(1), [npm](/man/npm)(1)
