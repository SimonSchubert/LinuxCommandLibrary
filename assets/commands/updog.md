# TLDR

**Start server**

```updog```

**Custom port**

```updog -p [8080]```

**Enable uploads**

```updog --upload```

**With password**

```updog --password [secret]```

**Custom directory**

```updog -d [path/to/directory]```

# SYNOPSIS

**updog** [_-p port_] [_-d dir_] [_--upload_] [_options_]

# PARAMETERS

**-p** _PORT_
> Port number.

**-d** _DIR_
> Directory to serve.

**--upload**
> Allow uploads.

**--password** _PASS_
> Set password.

**--ssl**
> Enable HTTPS.

# DESCRIPTION

**updog** serves files. It's a SimpleHTTPServer replacement.

File listing. Browse and download.

Upload support. Receive files.

Password protection. Basic security.

Modern interface. Clean design.

# CAVEATS

Python required. Development use only. Not for production.

# HISTORY

**updog** was created as a modern Python replacement for SimpleHTTPServer with file upload support.

# SEE ALSO

[python](/man/python)(1), [serve](/man/serve)(1), [http-server](/man/http-server)(1)
