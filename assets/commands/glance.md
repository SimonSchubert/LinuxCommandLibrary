# TAGLINE

legacy command-line client for the OpenStack Image service (Glance)

# TLDR

**List images**

```glance image-list```

**Show image details**

```glance image-show [image-id]```

**Create an image from a local file**

```glance image-create --name [image-name] --disk-format [qcow2] --container-format [bare] --file [image.qcow2]```

**Download image data**

```glance image-download [image-id] --file [output.qcow2]```

**Update an image**

```glance image-update [image-id] --name [new-name]```

**Delete an image**

```glance image-delete [image-id]```

# SYNOPSIS

**glance** [_options_] _command_ [_command-options_]

# PARAMETERS

**image-list**
> List available images.

**image-show** _image-id_
> Show details for an image.

**image-create**
> Create a new image record, optionally uploading data with **--file**.

**image-update** _image-id_
> Update an image's metadata.

**image-download** _image-id_
> Download image data to a file.

**image-upload** _image-id_
> Upload data for an existing image.

**image-delete** _image-id_
> Delete an image.

**--file** _path_
> Local file to upload or save downloaded data to.

**--disk-format** _format_
> Disk format (raw, qcow2, vmdk, vdi, iso, ami, ...).

**--container-format** _format_
> Container format (bare, ovf, aki, ari, ami, ...).

**--os-auth-token** _token_
> Authentication token, as an alternative to username/password.

**--os-username** _user_, **--os-password** _pass_
> OpenStack credentials, also settable via environment variables.

**--os-image-url** _url_
> Glance API endpoint, overriding the service catalog.

# DESCRIPTION

**glance** is the standalone command-line client shipped by **python-glanceclient** for the OpenStack Image service (Glance), which stores and serves the virtual machine images used to boot Nova instances.

It predates the unified **openstack** CLI and is now considered legacy: OpenStack deployments and documentation direct users toward `openstack image` subcommands for day-to-day image management (see [openstack-image](/man/openstack-image)(1)). The `glance` binary remains available for scripts and environments that still depend on it.

# CAVEATS

Superseded by `openstack image ...` in current OpenStack releases; new deployments should prefer the unified CLI. Requires OpenStack credentials (via `clouds.yaml`, environment variables, or `--os-*` flags). Large image uploads/downloads can take a long time and are subject to project storage quotas.

# HISTORY

Glance was one of the original OpenStack services, launched alongside **Nova** in the **2010** Austin release, and the `glance` CLI was its dedicated client for years before OpenStack consolidated per-service clients into the single `openstack` command.

# SEE ALSO

[openstack](/man/openstack)(1), [openstack-image](/man/openstack-image)(1), [nova](/man/nova)(1), [qemu-img](/man/qemu-img)(1)

# RESOURCES

```[Source code](https://github.com/openstack/python-glanceclient)```

```[CLI documentation](https://docs.openstack.org/python-glanceclient/latest/cli/details.html)```

<!-- verified: 2026-07-17 -->
