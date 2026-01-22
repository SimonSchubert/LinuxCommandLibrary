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

**gdown** downloads files from Google Drive via command line. It handles the authentication and download process automatically, including large files that normally require confirmation.

The tool extracts file IDs from various Google Drive URL formats. It supports downloading individual files and complete folders.

gdown is commonly used for downloading datasets and models shared via Google Drive.

# CAVEATS

Rate limits may apply. Large downloads may fail. Some files require permission. Cannot download private files without authentication.

# HISTORY

gdown was created to simplify Google Drive downloads, particularly for machine learning datasets. It provides wget/curl-like functionality for Drive URLs.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [gdrive](/man/gdrive)(1)
