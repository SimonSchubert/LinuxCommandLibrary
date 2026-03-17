# TAGLINE

Upload images to various image hosting services

# TLDR

**Upload image**

```picgo upload [image.png]```

**Upload from clipboard**

```picgo upload```

**Set default uploader**

```picgo use [smms]```

**List uploaders**

```picgo list uploader```

**Install plugin**

```picgo install [plugin-name]```

**Configure uploader**

```picgo set uploader```

**Show config**

```picgo config```

# SYNOPSIS

**picgo** _command_ [_options_] [_files_]

# PARAMETERS

**upload** [_files_...]
> Upload image(s); without arguments, uploads from clipboard.

**use** _uploader_
> Set the default uploader.

**list** [_type_]
> List available plugins or uploaders.

**install** _plugin_
> Install a plugin.

**uninstall** _plugin_
> Remove a plugin.

**set** _type_
> Interactively configure uploader settings.

**config**
> Show current configuration.

**-v**, **--version**
> Show version number.

**-d**, **--debug**
> Enable debug mode.

**-s**, **--silent**
> Enable silent mode.

**-c** _path_, **--config** _path_
> Set a custom config file path.

**-p** _url_, **--proxy** _url_
> Set a proxy for uploading.

**-h**, **--help**
> Show help.

# UPLOADERS

**smms** - SM.MS
**github** - GitHub repository
**imgur** - Imgur
**aliyun** - Aliyun OSS
**qiniu** - Qiniu Cloud
**tcyun** - Tencent COS
**upyun** - Upyun

# DESCRIPTION

**PicGo** (PicGo-Core) is a command-line image upload tool that supports multiple image hosting backends. It returns markdown-formatted URLs suitable for documentation and blog posts.

Multiple backends are supported through a plugin system, including GitHub, Imgur, SM.MS, and various Chinese cloud providers. Clipboard upload captures screenshots directly without saving files first. Output formats include markdown, HTML, and plain URLs for direct integration with documentation workflows.

# CAVEATS

Requires API keys or tokens for most hosting services. Some services have upload size or rate limits. Plugin quality varies. Requires Node.js runtime.

# HISTORY

**PicGo** was created as an image upload tool for Chinese developers. It simplifies adding images to documentation and blog posts by handling upload and URL generation.

# SEE ALSO

[imgur-upload](/man/imgur-upload)(1), [curl](/man/curl)(1)
