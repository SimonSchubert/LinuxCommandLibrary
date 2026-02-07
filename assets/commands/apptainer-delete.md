# TAGLINE

Delete container images from a remote library.

# TLDR

**Delete an image** from the Container Library

```apptainer delete library://[user/collection/container]:[tag]```

Delete an image for a **specific architecture**

```apptainer delete -A [amd64|arm64|ppc64le] library://[user/collection/container]:[tag]```

**Force delete** an image without confirmation

```apptainer delete -F library://[user/collection/container]:[tag]```

Delete an image from a **specific library server**

```apptainer delete --library [https://library.example.com] library://[user/collection/container]:[tag]```

Delete an image using **HTTP** instead of HTTPS

```apptainer delete --no-https library://[hostname/user/collection/container]:[tag]```

# SYNOPSIS

**apptainer delete** [_options_] _library://path_

# DESCRIPTION

**apptainer delete** removes container images from a remote Container Library. This is a destructive operation that permanently removes the specified image or image tag from the remote registry.

The command requires authentication with the target library and appropriate permissions to delete images.

# PARAMETERS

**-A, --arch** _architecture_
> Delete the image for a specific CPU architecture

**-F, --force**
> Force delete without confirmation prompt

**--library** _url_
> Specify an alternate Container Library URL

**--no-https**
> Use HTTP instead of HTTPS for the connection

# CAVEATS

This operation is irreversible. Deleted images cannot be recovered. Ensure you have backups of important container images before deletion. Only the image owner or library administrators can delete images.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-push](/man/apptainer-push)(1), [apptainer-pull](/man/apptainer-pull)(1)
