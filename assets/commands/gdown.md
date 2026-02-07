# TAGLINE

command-line Google Drive downloader

# TLDR

**Download from Google** Drive

```gdown [https://drive.google.com/uc?id=FILE_ID]```

**Download by ID**

```gdown [file_id]```

**Download folder**

```gdown --folder [https://drive.google.com/drive/folders/FOLDER_ID]```

**Output to file**

```gdown [file_id] -O [output.zip]```

**Fuzzy search**

```gdown --fuzzy [https://drive.google.com/...]```

# SYNOPSIS

**gdown** [_options_] _url_or_id_

# PARAMETERS

_URL_OR_ID_
> Google Drive URL or file ID.

**-O** _FILE_, **--output** _FILE_
> Output filename.

**--folder**
> Download entire folder.

**--fuzzy**
> Enable fuzzy URL extraction.

**-q**, **--quiet**
> Suppress output.

**--help**
> Display help information.

# DESCRIPTION

**gdown** is a command-line tool for downloading files and folders from Google Drive, providing wget/curl-like functionality specifically for Drive URLs. It automatically handles Google Drive's download mechanisms, including the virus scan confirmation step that large files require, making automated downloads possible.

The tool intelligently extracts file IDs from various Google Drive URL formats, whether they're sharing links, direct file URLs, or folder URLs. It can download individual files, entire folders recursively, and works with both public and shared links without requiring OAuth authentication for public content.

gdown is particularly popular in machine learning and data science workflows, where large datasets and model weights are frequently shared via Google Drive. It enables reproducible research pipelines and automated data fetching in scripts. The fuzzy matching option helps when URLs are embedded in redirects or formatted unusually.

For files requiring authentication or private Drive content, gdown's functionality is limited. It works best with publicly accessible shared files and folders, making it ideal for open datasets and model distributions.

# CAVEATS

Rate limits may apply. Large downloads may fail. Some files require permission. Cannot download private files without authentication.

# HISTORY

gdown was created to simplify Google Drive downloads, particularly for machine learning datasets. It provides wget/curl-like functionality for Drive URLs.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [gdrive](/man/gdrive)(1)
