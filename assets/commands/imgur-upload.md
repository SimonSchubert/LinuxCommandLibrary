# TAGLINE

uploads images to Imgur from the command line

# TLDR

**Upload image**

```imgur-upload [image.png]```

**Upload from clipboard**

```imgur-upload -c```

**Upload with custom title**

```imgur-upload -t "[My Image]" [image.jpg]```

**Upload from URL**

```imgur-upload -u "[https://example.com/image.png]"```

# SYNOPSIS

**imgur-upload** [_options_] [_file_]

# PARAMETERS

_file_
> Image file to upload.

**-c**, **--clipboard**
> Upload from clipboard.

**-u**, **--url** _url_
> Upload image from URL.

**-t**, **--title** _text_
> Image title.

**-d**, **--description** _text_
> Image description.

**-a**, **--album** _id_
> Add to album.

# DESCRIPTION

**imgur-upload** uploads images to Imgur from the command line. It returns the direct image URL, useful for sharing screenshots or images quickly.

Various implementations exist; some require Imgur API credentials while others use anonymous uploads.

# EXAMPLE SCRIPT

```bash
#!/bin/bash
# Screenshot and upload
scrot /tmp/screenshot.png
url=$(imgur-upload /tmp/screenshot.png)
echo "$url" | xclip -selection clipboard
notify-send "Uploaded: $url"
```

# CAVEATS

Requires Imgur API key for some versions. Anonymous uploads may have limits. Images may be removed if violating TOS. Multiple implementations exist with different features.

# HISTORY

Various imgur command-line uploaders have been created by the community. They provide quick image sharing from the terminal, popular with screenshot workflows and automation.

# SEE ALSO

[curl](/man/curl)(1), [scrot](/man/scrot)(1), [xclip](/man/xclip)(1)
