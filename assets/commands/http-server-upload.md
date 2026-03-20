# TAGLINE

Simple zero-configuration HTTP server for uploading files

# TLDR

**Start upload server on default port 8080**

```http-server-upload```

**Start on a specific port with a token**

```http-server-upload --port [9090] --token [my-secret-token]```

**Set upload directory and max file size**

```http-server-upload --upload-dir [./uploads] --max-file-size [500]```

**Enable automatic folder creation**

```http-server-upload --enable-folder-creation```

**Configure via environment variables**

```PORT=9000 UPLOAD_DIR=~/uploads/ TOKEN=secret http-server-upload```

# SYNOPSIS

**http-server-upload** [_options_] [_uploadRootPath_]

# PARAMETERS

Configuration is done by command line arguments or environment variables. If both are used, arguments take higher priority.

**--port** _PORT_ (env: PORT)
> Server port. Default: 8080. If the port is in use, it is automatically increased until a free port is found.

**--upload-dir** _DIR_ (env: UPLOAD_DIR)
> Directory where uploaded files are stored. Default: current working directory.

**--upload-tmp-dir** _DIR_ (env: UPLOAD_TMP_DIR)
> Temporary directory for uploads before moving to final destination.

**--token** _TOKEN_ (env: TOKEN)
> Optional token required for uploads, providing basic access protection.

**--max-file-size** _MB_ (env: MAX_FILE_SIZE)
> Maximum allowed file size in megabytes. Default: 200.

**--disable-auto-port** (env: DISABLE_AUTO_PORT)
> Prevent automatic port increment if the port is already in use.

**--enable-folder-creation** (env: ENABLE_FOLDER_CREATION)
> Automatically create folders when uploading to a non-existent path.

**--path-regexp** _REGEX_ (env: PATH_REGEXP)
> Regular expression to validate upload paths.

**--index-file** _FILE_ (env: INDEX_FILE)
> Use a custom HTML file for the upload form.

**-h**, **--help**
> Display help text.

# DESCRIPTION

**http-server-upload** is a simple zero-configuration Node.js command-line HTTP server for uploading files. When running, visit http://localhost:8080/ to access the upload form. Files are uploaded to the current working directory by default.

The tool is useful for quick file transfers without setting up full file sharing. An optional token provides basic access protection.

# CAVEATS

Not intended for production use. Requires Node.js 14.18 or higher. If the desired port is already in use, the port is automatically incremented until a free port is found.

# SEE ALSO

[http-server](/man/http-server)(1), [updog](/man/updog)(1)
