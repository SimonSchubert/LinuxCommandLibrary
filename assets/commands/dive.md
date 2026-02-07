# TAGLINE

explore Docker image contents and layer efficiency

# TLDR

**Analyze a Docker image**

```dive [image:tag]```

**Analyze with CI mode**

```dive [image:tag] --ci```

**Build and analyze** in one step

```dive build -t [image:tag] [.]```

**Analyze from tar archive**

```dive --source [docker-archive] [image.tar]```

**Set efficiency threshold** for CI

```dive [image:tag] --ci --highestUserWastedPercent [0.1]```

# SYNOPSIS

**dive** [_options_] _image_

# PARAMETERS

_IMAGE_
> Docker image name with optional tag.

**--ci**
> CI mode (no TUI, returns exit code).

**--source** _SOURCE_
> Image source: docker, podman, docker-archive.

**build** [_args_]
> Build image then analyze.

**--highestUserWastedPercent** _N_
> Max wasted space percentage for CI pass.

**--lowestEfficiency** _N_
> Minimum efficiency for CI pass.

**--json**
> Output results as JSON.

**--help**
> Display help information.

# DESCRIPTION

**dive** is a tool for exploring Docker image contents and layer efficiency. It provides an interactive TUI showing what changed in each layer, helping identify opportunities to reduce image size.

The tool displays a layer-by-layer breakdown of the image filesystem, highlighting added, removed, and modified files. The efficiency score indicates how well the image is optimized, with wasted space shown explicitly.

dive integrates into CI pipelines to enforce image efficiency requirements. It can analyze images from Docker, Podman, or archive files, and can build images before analysis.

# CAVEATS

Large images may take time to analyze. Some layer details depend on image build history. Squashed images have limited layer information. Requires container runtime access for live images.

# HISTORY

dive was created by **Alex Goodman** and released in **2018**. It was developed to address the common problem of Docker image bloat by making layer contents visible and quantifying efficiency.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [skopeo](/man/skopeo)(1)
