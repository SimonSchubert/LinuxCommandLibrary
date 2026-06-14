# TAGLINE

Mirror websites for offline, JavaScript-free browsing

# TLDR

**Clone a website** into an offline-browsable folder

```kage clone [https://example.com]```

**Preview** a cloned folder in a local web server

```kage serve [path/to/mirror]```

**Pack a mirror** into a self-contained archive

```kage pack [path/to/mirror]```

**Open a packed** archive and serve it

```kage open [archive.zim]```

# SYNOPSIS

**kage** _command_ [_arguments_]

# DESCRIPTION

**kage** clones websites into static, offline-browsable copies. It drives a headless Chrome browser to render each page, captures the final DOM after scripts have executed, strips out all JavaScript, and downloads the referenced CSS, images, and fonts to local paths. The result is a self-contained mirror that works completely offline with no network calls and no tracking.

Because pages are saved after rendering rather than as raw HTML, sites that build their content with JavaScript are captured as plain, static markup. The saved copy can be browsed directly, served locally for preview, or packed into a single portable archive.

# COMMANDS

**clone** _url_
> Render a website with headless Chrome and save a static, JavaScript-free mirror to a local folder.

**serve** [_dir_]
> Start a local web server to preview a previously cloned folder.

**pack** _mirror-dir_
> Compress a mirror directory into a ZIM file or a self-contained binary.

**open** _file_
> Serve a packed archive (for example a .zim file) over a local web server.

# CAVEATS

Requires a headless Chrome or Chromium installation to render pages. Stripping JavaScript means interactive features that depend on client-side scripts will not work in the mirror. Sites behind authentication or aggressive bot protection may not clone cleanly.

# HISTORY

**kage** is written in **Go** and distributed under the MIT license. The name means "shadow" in Japanese, reflecting its purpose of producing a static shadow of a live website.

# SEE ALSO

[wget](/man/wget)(1), [httrack](/man/httrack)(1), [monolith](/man/monolith)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/tamnd/kage)```

```[Homepage](https://kage.tamnd.com)```

<!-- verified: 2026-06-14 -->
