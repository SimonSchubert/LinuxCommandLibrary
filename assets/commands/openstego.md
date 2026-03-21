# TAGLINE

Steganography tool for hiding data within images

# TLDR

**Embed data in an image**

```openstego embed -mf [secret.txt] -cf [cover.png] -sf [output.png]```

**Extract hidden data from a stego image**

```openstego extract -sf [stego.png] -xd [output_dir]```

**Embed with encryption using a password**

```openstego embed -mf [secret.txt] -cf [cover.png] -sf [output.png] -e -p [password]```

**Extract with a password**

```openstego extract -sf [stego.png] -xd [output_dir] -p [password]```

**Generate a signature for watermarking**

```openstego gensig -gf [signature.sig] -p [password]```

**Verify watermark presence in an image**

```openstego checkmark -sf [image.png] -gf [signature.sig]```

**List supported steganography algorithms**

```openstego algorithms```

# SYNOPSIS

**openstego** _command_ [_options_]

# PARAMETERS

**embed**
> Hide data in a cover image using steganography.

**extract**
> Extract hidden data from a stego image.

**gensig**
> Generate a signature file for watermarking.

**embedmark**
> Embed a watermark into a cover file using a signature.

**checkmark**
> Check for watermark presence in a stego file.

**algorithms**
> Display supported steganography algorithms.

**readformats**
> Display supported input image formats.

**writeformats**
> Display supported output image formats.

**-mf**, **--messagefile** _file_
> Message file to embed (reads from stdin if omitted).

**-cf**, **--coverfile** _file_
> Cover image file (supports wildcards for multiple files).

**-sf**, **--stegofile** _file_
> Stego file (output image for embed, input for extract/checkmark).

**-gf**, **--sigfile** _file_
> Signature file for watermarking operations.

**-xf**, **--extractfile** _file_
> Override the filename for extracted data.

**-xd**, **--extractdir** _dir_
> Directory for extracted data (default: current directory).

**-p**, **--password** _password_
> Password for encryption/decryption or signature generation.

**-a**, **--algorithm** _name_
> Steganography algorithm to use.

**-e**, **--encrypt**
> Enable encryption of the embedded message.

**-E**, **--noencrypt**
> Disable encryption (default).

**-c**, **--compress**
> Compress message before embedding (default).

**-C**, **--nocompress**
> Skip compression of the message.

**-A**, **--cryptalgo** _algorithm_
> Encryption algorithm (AES128 or AES256).

# DESCRIPTION

**OpenStego** is a steganography tool for hiding data within images. It supports two main operations: data hiding (embedding secret messages in cover images) and digital watermarking (embedding and verifying invisible signatures). Messages can be optionally compressed and encrypted before embedding.

# SUPPORTED FORMATS

```
Cover images: PNG, BMP, GIF, JPEG, WBMP
```

# CAVEATS

Requires Java to run. Large messages need sufficiently large cover images. JPEG lossy compression may affect embedded data reliability; PNG is recommended. A GUI is also available.

# HISTORY

OpenStego was created by **Samir Vaidya** as an open-source steganography application supporting multiple algorithms.

# SEE ALSO

[steghide](/man/steghide)(1), [outguess](/man/outguess)(1), [stegsnow](/man/stegsnow)(1)
