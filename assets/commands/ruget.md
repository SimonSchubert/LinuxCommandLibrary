# TLDR

**Download** URL contents to file

```ruget https://example.com/file```

Download to **specified output** file

```ruget -o file_name https://example.com/file```

# SYNOPSIS

**ruget** [_options_] _URL_

# PARAMETERS

**-o**, **--output** _file_
> Specify output filename

# DESCRIPTION

**ruget** is a download utility written in Rust, serving as an alternative to wget. It downloads files from URLs with a simple command-line interface.

The tool focuses on simplicity and modern Rust implementation.

# CAVEATS

May have fewer features than wget or curl. Check project documentation for supported protocols and options.

# HISTORY

Developed as a Rust alternative to traditional download tools like wget.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [aria2c](/man/aria2c)(1)
