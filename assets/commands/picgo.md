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

**upload**
> Upload image(s).

**use**
> Set default uploader.

**list**
> List plugins/uploaders.

**install**
> Install plugin.

**uninstall**
> Remove plugin.

**set**
> Configure settings.

**config**
> Show configuration.

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

**picgo** uploads images to various image hosting services. It returns markdown-formatted URLs for documentation.

Multiple backends are supported through plugins. GitHub, S3-compatible, and dedicated image hosts work.

Clipboard upload captures screenshots directly. No need to save files first.

Configuration stores API keys and preferences. Each uploader has specific settings.

Output formats include markdown, HTML, and plain URLs. Direct integration with documentation workflows.

# CAVEATS

Requires API keys for most services. Some services have upload limits. Plugin quality varies.

# HISTORY

**PicGo** was created as an image upload tool for Chinese developers. It simplifies adding images to documentation and blog posts by handling upload and URL generation.

# SEE ALSO

[imgur-upload](/man/imgur-upload)(1), [curl](/man/curl)(1)
