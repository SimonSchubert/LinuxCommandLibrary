# TAGLINE

node-based workflow system for Stable Diffusion

# TLDR

**Start ComfyUI server**

```python [main.py]```

**Start on specific port**

```python [main.py] --port [8188]```

**Start with CPU only**

```python [main.py] --cpu```

**Start without auto-opening browser**

```python [main.py] --disable-auto-launch```

**Use specific GPU**

```python [main.py] --cuda-device [0]```

**Run with low VRAM mode**

```python [main.py] --lowvram```

**Execute a workflow via API**

```curl -X POST http://localhost:8188/prompt -H "Content-Type: application/json" -d @[workflow.json]```

# SYNOPSIS

**python** _main.py_ [_options_]

**comfyui** [_options_]

# PARAMETERS

**--port** _PORT_
> Server port (default: 8188).

**--listen** _ADDR_
> Listen address (default: 127.0.0.1, use 0.0.0.0 for network).

**--cpu**
> Run on CPU only.

**--cuda-device** _ID_
> CUDA GPU device index.

**--lowvram**
> Low VRAM mode for GPUs with limited memory.

**--dont-print-server**
> Suppress server output.

**--output-directory** _DIR_
> Custom output directory.

**--temp-directory** _DIR_
> Custom temp directory.

**--auto-launch**
> Auto-open browser on start.

**--disable-auto-launch**
> Prevent auto-opening browser.

# DESCRIPTION

**ComfyUI** is a node-based workflow system for Stable Diffusion and Flux image generation. It provides both a visual graph editor (web UI) and a REST API for programmatic use.

Workflows are built by connecting nodes: model loaders, samplers, VAE decoders, prompt encoders, and more. Complex pipelines (img2img, inpainting, ControlNet, LoRA stacking) are constructed visually without code.

The API accepts workflow JSON, enabling headless batch generation and integration with scripts. Workflows created in the web UI can be exported and run via the API.

An extensive ecosystem of custom nodes adds capabilities: video generation, face restoration, upscaling, IP-Adapter, and more. Custom nodes are installed into the `custom_nodes/` directory.

Install via comfy-cli (`pip install comfy-cli && comfy install`) or clone the repository and install requirements. Models are placed in the `models/` directory tree.

# CAVEATS

Web UI requires a modern browser. GPU strongly recommended. Custom nodes may conflict. Model files are large (2-10+ GB each). Python 3.10+ required. Complex workflows can consume significant VRAM.

# HISTORY

**ComfyUI** was created by **comfyanonymous** in **2023** as a modular alternative to the Automatic1111 web UI. Its node-based design attracted power users who needed flexible, reproducible generation pipelines. It became one of the most popular Stable Diffusion interfaces, with a large community building custom nodes.

# SEE ALSO

[sd-cli](/man/sd-cli)(1), [mflux](/man/mflux)(1), [convert](/man/convert)(1)
