# TLDR

**Save webpage as single HTML file**

```monolith [https://example.com] -o [page.html]```

**Include JavaScript**

```monolith -j [https://example.com] -o [page.html]```

**Exclude images**

```monolith -i [https://example.com] -o [page.html]```

**Isolate from network** (no external requests)

```monolith -I [https://example.com] -o [page.html]```

**Set custom user agent**

```monolith -u "[Mozilla/5.0...]" [https://example.com] -o [page.html]```

**Save from local file**

```monolith [file:///path/to/page.html] -o [output.html]```

**Set timeout**

```monolith -t [30] [https://example.com] -o [page.html]```

# SYNOPSIS

**monolith** [_-o output_] [_-jicfIe_] [_-t timeout_] [_-u agent_] _url_

# PARAMETERS

**-o** _FILE_, **--output** _FILE_
> Output file.

**-j**, **--no-js**
> Exclude JavaScript.

**-c**, **--no-css**
> Exclude CSS.

**-i**, **--no-images**
> Exclude images.

**-f**, **--no-frames**
> Exclude iframes.

**-F**, **--no-fonts**
> Exclude fonts.

**-v**, **--no-video**
> Exclude video.

**-a**, **--no-audio**
> Exclude audio.

**-I**, **--isolate**
> Disable network requests.

**-e**, **--ignore-errors**
> Continue on resource errors.

**-t** _SEC_, **--timeout** _SEC_
> Request timeout.

**-u** _AGENT_, **--user-agent** _AGENT_
> Custom User-Agent.

**-b** _URL_, **--base-url** _URL_
> Base URL for relative paths.

**-d** _DOMAIN_, **--domain** _DOMAIN_
> Limit to domain.

**-k**, **--insecure**
> Accept invalid certificates.

**-s**, **--silent**
> Suppress output.

# DESCRIPTION

**monolith** saves complete webpages as single HTML files. It embeds all assets - CSS, images, fonts, JavaScript - as data URLs within the HTML, creating a fully self-contained document.

Unlike browser "Save As" which creates folders of assets, monolith produces one file that works offline. This is ideal for archiving, documentation, and sharing.

The isolation mode (-I) creates truly offline pages by removing external references. Combined with -j to remove JavaScript, it creates static snapshots without any network dependencies.

Asset exclusion options reduce file size when full fidelity isn't needed. Excluding images or fonts significantly shrinks output. The tool handles CSS @import and relative URLs correctly.

Local files can be processed using file:// URLs. This enables converting existing HTML with external assets into self-contained documents.

Error handling with -e continues processing when individual resources fail to load, useful for pages with broken links or blocked resources.

# CAVEATS

Large pages with many assets produce large files. Base64 encoding increases size. Dynamic JavaScript content won't be captured. Some sites block automated access. Cookie-protected content not accessible. SPAs may not render completely.

# HISTORY

**monolith** was created by **Sunshine** (nicholaides) around **2019**. Written in Rust, it provides a modern alternative to wget/curl for webpage archiving. The single-file output format simplifies storage and sharing compared to traditional archival methods.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [httrack](/man/httrack)(1), [singlefile](/man/singlefile)(1)
