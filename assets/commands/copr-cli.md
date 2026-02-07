# TAGLINE

COPR build system client

# TLDR

**Create a new COPR project**

```copr-cli create [project_name] --chroot [fedora-39-x86_64]```

**Build a package from SRPM**

```copr-cli build [project_name] [package.src.rpm]```

**Build from a spec file URL**

```copr-cli build [project_name] --url [https://example.com/spec.src.rpm]```

**List your COPR projects**

```copr-cli list```

**Check build status**

```copr-cli status [build_id]```

**Download built packages**

```copr-cli download-build [build_id]```

**Delete a project**

```copr-cli delete [project_name]```

# SYNOPSIS

**copr-cli** _command_ [_options_] [_arguments_]

# PARAMETERS

**create** _NAME_
> Create a new COPR project.

**build** _PROJECT_ _SRPM_
> Submit a build to a project.

**list**
> List your COPR projects.

**status** _BUILD_ID_
> Check the status of a build.

**download-build** _BUILD_ID_
> Download the built RPMs.

**delete** _PROJECT_
> Delete a project.

**--chroot** _CHROOT_
> Specify build target (e.g., fedora-39-x86_64, epel-9-x86_64).

**--url** _URL_
> Build from an SRPM URL instead of local file.

**--nowait**
> Don't wait for build to complete.

**--config** _FILE_
> Use alternate configuration file.

# CONFIGURATION

**~/.config/copr**
> API token configuration for authenticating with the COPR build system.

# DESCRIPTION

**copr-cli** is the command-line client for Fedora's COPR build system. It allows developers to create projects, submit builds, manage repositories, and automate package distribution without using the web interface.

The tool handles the complete package lifecycle: creating projects with specified build targets (chroots), submitting source RPMs for building, monitoring build progress, and downloading the resulting packages. It supports building from local files, URLs, or SCM repositories.

copr-cli is essential for CI/CD pipelines that automatically build and publish packages to COPR. Authentication is handled via API tokens stored in a configuration file, enabling scripted operations.

# CAVEATS

Requires a Fedora Account System (FAS) account and API token configured in **~/.config/copr**. Build chroots must be enabled for the project before building. Large builds may take significant time; use **--nowait** for async operation.

# HISTORY

copr-cli was developed alongside the COPR build service by the Fedora Project. It provides programmatic access to the same functionality available through the COPR web interface at **copr.fedorainfracloud.org**, enabling automation and integration with development workflows.

# SEE ALSO

[copr](/man/copr)(1), [rpmbuild](/man/rpmbuild)(1), [mock](/man/mock)(1), [dnf](/man/dnf)(1)
