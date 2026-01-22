# TLDR

**Package URL as app**

```pake [https://example.com]```

**Package with custom name**

```pake [url] --name [AppName]```

**Package with custom icon**

```pake [url] --icon [icon.png]```

**Package for specific platform**

```pake [url] --targets [macos|linux|windows]```

# SYNOPSIS

**pake** [_options_] _url_

# PARAMETERS

_URL_
> Web URL to package.

**--name** _NAME_
> Application name.

**--icon** _FILE_
> Application icon.

**--targets** _PLATFORMS_
> Build targets.

**--width** _PIXELS_
> Window width.

**--height** _PIXELS_
> Window height.

**--help**
> Display help information.

# DESCRIPTION

**pake** converts web pages to desktop apps. Uses Rust and system webview.

The tool creates lightweight native wrappers. Cross-platform support.

pake packages web as apps.

# CAVEATS

Written in Rust. System webview used. Size smaller than Electron.

# HISTORY

Pake was created as a **lightweight alternative** to Electron for packaging web apps.

# SEE ALSO

[electron](/man/electron)(1), [tauri](/man/tauri)(1), [nativefier](/man/nativefier)(1)

