# TAGLINE

uploads images to Imgur from the command line

# TLDR

**Upload an image** and print its URL

```imgur-upload [image.png]```

Upload **multiple images** into a new album

```imgur-upload [image1.jpg] [image2.jpg]```

Upload and **delete the local file** afterwards

```imgur-upload -d [screenshot.png]```

Upload the **latest image** in a directory

```imgur-upload latest [~/Pictures/Screenshots]```

**Set the base directory** used by latest

```imgur-upload basedir [~/Pictures/Screenshots]```

View the **upload history**

```imgur-upload history```

**Remove** an uploaded image by its deletehash

```imgur-upload remove [deletehash]```

# SYNOPSIS

**imgur-upload** [_-d_] _file_ ...

**imgur-upload** _command_ [_argument_]

# PARAMETERS

_file_ ...
> Image files to upload. One file prints the image link; several files are uploaded as an album.

**latest** [_directory_]
> Upload the most recent image in _directory_, or in the base directory if omitted.

**basedir** [_directory_]
> Show or set the base directory.

**history**
> Show previous uploads with their deletehashes.

**clear**
> Clear the upload history.

**remove** _deletehash_
> Delete an uploaded image from Imgur.

**-d**, **--delete**
> Delete local image files after they are uploaded.

# DESCRIPTION

**imgur-upload** (from the **imgur-upload-cli** npm package) uploads images anonymously to Imgur through the Imgur API and prints the resulting link. It keeps a local history including the deletehash needed to remove an upload later.

# CONFIGURATION

**IMGUR_CLIENT_ID**
> Use your own Imgur API client ID instead of the built-in shared one.

# EXAMPLE SCRIPT

```bash
#!/bin/bash
# Screenshot, upload and copy the link
scrot /tmp/screenshot.png
url=$(imgur-upload /tmp/screenshot.png)
echo "$url" | xclip -selection clipboard
notify-send "Uploaded: $url"
```

# CAVEATS

Install with **npm install -g imgur-upload-cli**. The daily API upload limit is shared by everyone using the built-in client ID; set **IMGUR_CLIENT_ID** if uploads start failing. The project has not been updated since 2021. Several unrelated Imgur uploader scripts exist under similar names with different options. Imgur may remove content that violates its terms, and has blocked access from the UK since 2025.

# HISTORY

**imgur-upload-cli** was written by **Arnelle Balane** and first published to npm in **2016**.

# SEE ALSO

[curl](/man/curl)(1), [scrot](/man/scrot)(1), [xclip](/man/xclip)(1)

# RESOURCES

```[Source code](https://github.com/arnellebalane/imgur-upload-cli)```

<!-- verified: 2026-09-29 -->
