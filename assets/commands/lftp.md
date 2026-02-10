# TAGLINE

sophisticated file transfer program supporting FTP, HTTP, SFTP, FISH

# TLDR

**Connect** to FTP server

```lftp -u [username] ftp.example.com```

**Download** multiple files

```mget [path/to/*.png]```

**Upload** multiple files

```mput [path/to/*.zip]```

**Delete** remote files

```mrm [path/to/*.txt]```

**Rename** remote file

```mv [original] [new_name]```

**Mirror** remote directory locally

```mirror [remote_dir] [local_dir]```

**Upload** directory to remote

```mirror -R [local_dir] [remote_dir]```

# SYNOPSIS

**lftp** [_options_] [_site_]

# DESCRIPTION

**lftp** is a sophisticated file transfer program supporting FTP, HTTP, SFTP, FISH, and torrent protocols. It features job control, bookmarks, mirroring, and can transfer several files in parallel.

# PARAMETERS

**-u, --user USER[,PASS]**
> Use specified username and optional password

**-p PORT**
> Connect to specified port

**-e COMMANDS**
> Execute commands after connecting

**-c COMMANDS**
> Execute commands and exit

**-f FILE**
> Execute commands from file

**-d**
> Enable debug output

# INTERACTIVE COMMANDS

**mget PATTERN**
> Download files matching pattern

**mput PATTERN**
> Upload files matching pattern

**mrm PATTERN**
> Delete remote files matching pattern

**mirror [OPTIONS] REMOTE [LOCAL]**
> Mirror directory (-R for reverse/upload)

**pget FILE**
> Download file using multiple connections

**queue**
> Queue commands for later execution

# CAVEATS

Interactive commands like mget/mput are used within an lftp session, not from the shell. Supports parallel transfers for improved performance.

# SEE ALSO

[ftp](/man/ftp)(1), [sftp](/man/sftp)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)
