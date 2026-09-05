# TAGLINE

Convert HyperCard 2.x stacks into self-contained HTML pages

# TLDR

**Convert** a stack, writing HTML next to the source file

```hc2html ["My Stack"]```

**Write** the page to a chosen file

```hc2html ["My Stack"] -o [my-stack.html]```

**Map** a classic Mac font to a CSS font stack

```hc2html ["My Stack"] --font "[GoodDogPlain=Gochi Hand, cursive]"```

**Keep** field edits and new cards in the browser

```hc2html ["My Stack"] --persist```

**Strip** HyperTalk scripts for a static viewer

```hc2html ["My Stack"] --no-scripts```

**Also dump** pictures, icons, and sounds as files

```hc2html ["My Stack"] --dump-assets [assets]```

**Decode** a Central European stack

```hc2html ["My Stack"] --encoding [mac_latin2]```

**Also write** the intermediate JSON model

```hc2html ["My Stack"] --json [model.json]```

# SYNOPSIS

**hc2html** _STACK_ [**-o** _OUT.html_] [**--encoding** _ENC_] [**--title** _T_] [**--chrome** window|none] [**--persist**] [**--lenient**] [**--no-scripts**] [**--font** _NAME=CSS_] [**--start-card** _N_] [**--json** _FILE_] [**--dump-assets** _DIR_] [**-q**]

# PARAMETERS

**STACK**
> HyperCard 2.x stack file (data fork, or a MacBinary **.bin**).

**-o**, **--output** _FILE_
> Output HTML path. Default is the stack path with **.html** appended (**.bin** is stripped first).

**--encoding** _ENC_
> Mac text encoding of the stack. Default **mac_roman**. Other Python **mac_*** codecs work, including **mac_latin2**, **mac_cyrillic**, **mac_greek**, **mac_turkish**, and **mac_iceland**.

**--title** _T_
> HTML page title. Default is the stack name.

**--chrome** **window**|**none**
> Draw a classic Mac menu bar and window around the card (**window**, the default), or output the card alone.

**--persist**
> Store field edits, hilites, and cards created with **doMenu "New Card"** in the browser's localStorage.

**--lenient**
> Log unknown HyperTalk to the browser console instead of showing a HyperCard-style error dialog.

**--no-scripts**
> Omit all HyperTalk from the viewer (static page).

**--font** _NAME=CSS_
> Map a Mac font name to a CSS font stack. Repeatable.

**--start-card** _N_
> 1-based card number to open first. Default **1**.

**--json** _FILE_
> Also write the intermediate JSON model (pictures as data URIs).

**--dump-assets** _DIR_
> Also write every picture, icon, pattern, and sound as files under _DIR_.

**-q**, **--quiet**
> Do not print the conversion summary.

**--version**
> Print **hc2html** _version_ and exit.

# DESCRIPTION

**hc2html** reads a HyperCard 2.x stack and writes one self-contained HTML file. Card and background pictures, icons, sounds, font metadata, and scripts are embedded, so the page opens in a modern browser with no server.

It parses HyperCard formats **8** (2.0/2.1) and **10** (2.2 and later): stack header, backgrounds, cards, button and field parts, unshared background field contents, unshared button hilites, the font table, card order from **LIST**/**PAGE** blocks, and WOBA-compressed pictures. Pictures are decoded to PNG with an alpha channel so unpainted card pixels show the background.

The resource fork supplies **ICON**, **ICN#** (favicon), **CURS**, and **snd** resources (formats 1 and 2, uncompressed 8/16-bit, converted to WAV). The fork is looked up in this order: a native **..namedfork/rsrc** on macOS, **Stack.rsrc** beside the data fork, an AppleDouble **._Stack** file, or the stack itself as MacBinary **.bin**.

The viewer draws the usual button and field styles, XOR hilites, and a HyperTalk subset (message hierarchy, chunks, **put**/**get**/**set**, **if**/**repeat**, **go**, visual effects, **answer**/**ask**, **play**, object properties, and common functions). Unknown statements raise a "Can't understand" dialog unless **--lenient** is set. Well-known externals such as **AddColor** are ignored with a console note.

There are no Python package dependencies. The converter runs on Python 3.9+; the viewer is plain JavaScript.

# CAVEATS

HyperCard **1.x** stacks (format less than 8) are rejected; open them in HyperCard 2.x once and save. Paint tools, XCMDs/XFCNs, script-created menus, printing, file I/O, AppleScript, styled text runs inside fields, **privateAccess**, and encrypted stacks are not implemented.

Icons and sounds are missing without a resource fork. Copying a stack through Windows, zip, or the web often drops the fork unless the file is MacBinary or kept with its **._** AppleDouble sidecar.

# HISTORY

**hc2html** 0.1.0 is an MIT-licensed preservation tool. Its WOBA decoder is a Python port of Rebecca Bettencourt's MIT-licensed C++ decoder from Uli Kusterer's **stackimport**. HyperCard itself was Apple's 1987 Macintosh authoring environment; this converter contains no HyperCard code or artwork, only a reader for the file format.

# SEE ALSO

[unar](/man/unar)(1), [python3](/man/python3)(1), [file](/man/file)(1), [pandoc](/man/pandoc)(1)

# RESOURCES

```[Source code](https://github.com/stachon/hc2html)```

<!-- verified: 2026-09-05 -->
