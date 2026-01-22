# TLDR

Convert **OpenSSH to Dropbear** format

```dropbearconvert openssh dropbear ~/.ssh/id_rsa output_key```

Convert **Dropbear to OpenSSH** format

```dropbearconvert dropbear openssh input_key ~/.ssh/id_rsa```

# SYNOPSIS

**dropbearconvert** _input_type_ _output_type_ _input_file_ _output_file_

# DESCRIPTION

**dropbearconvert** converts private keys between Dropbear and OpenSSH formats. Dropbear and OpenSSH use different private key formats, and this utility bridges the two implementations.

# PARAMETERS

**input_type**
> Format of the input key: "dropbear" or "openssh"

**output_type**
> Format of the output key: "dropbear" or "openssh"

**input_file**
> Path to the input private key file

**output_file**
> Path for the converted output key file

# CAVEATS

Encrypted keys must be decrypted first using ssh-keygen before conversion. DSS and PKCS8 formats are not currently supported. OpenSSH output is compatible with OpenSSH version 6.5 and later.

# HISTORY

**dropbearconvert** is part of **Dropbear**, a lightweight SSH server and client implementation designed for embedded systems and environments with limited resources.

# SEE ALSO

[dropbear](/man/dropbear)(8), [dropbearkey](/man/dropbearkey)(1), [ssh-keygen](/man/ssh-keygen)(1)
