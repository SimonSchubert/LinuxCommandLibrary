# TLDR

**Scan Docker Hub** for secrets

```dockdiver -u [username]```

**Scan specific image**

```dockdiver -i [image:tag]```

**Scan with output** file

```dockdiver -u [username] -o [results.txt]```

**Scan with custom** patterns

```dockdiver -i [image:tag] -p [patterns.json]```

# SYNOPSIS

**dockdiver** [_options_]

# PARAMETERS

**-u** _USERNAME_
> Docker Hub username to scan.

**-i** _IMAGE_
> Specific image to analyze.

**-o** _FILE_
> Output file for results.

**-p** _FILE_
> Custom pattern file.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**dockdiver** is a security tool for analyzing Docker images and Docker Hub repositories for exposed secrets, credentials, and sensitive information. It scans image layers to identify potentially dangerous data leakage.

The tool searches for common secret patterns including API keys, passwords, private keys, and credentials embedded in Docker images. It can scan individual images or entire user repositories.

dockdiver helps security teams audit container images before deployment and identify credential exposure in public registries.

# CAVEATS

Scanning large images may take time. Some secrets may be obfuscated or encoded. Only scans accessible images. Pattern matching may produce false positives.

# HISTORY

dockdiver was created as a security research tool to address the widespread problem of secrets being accidentally committed to Docker images. It automates the discovery of exposed credentials in container registries.

# SEE ALSO

[dive](/man/dive)(1), [trivy](/man/trivy)(1), [grype](/man/grype)(1)
