# TLDR

**Launch** a training script with default configuration

```accelerate launch [train.py]```

**Configure** accelerate for your hardware

```accelerate config```

Launch with **specific GPU** configuration

```accelerate launch --num_processes [4] --gpu_ids [0,1,2,3] [train.py]```

Launch training on **multiple machines**

```accelerate launch --num_machines [2] --machine_rank [0] --main_process_ip [192.168.1.1] [train.py]```

# SYNOPSIS

**accelerate** _command_ [_options_] [_script_] [_script_args_]

# DESCRIPTION

**accelerate** is a Hugging Face library that enables PyTorch code to run on any distributed configuration with minimal code changes. It handles the complexity of distributed training across multiple GPUs, TPUs, and machines while keeping your training code simple.

The tool abstracts away the boilerplate needed for mixed precision training, gradient accumulation, and multi-device parallelism. It automatically detects available hardware and configures the training environment appropriately.

# PARAMETERS

**config**
> Run the configuration wizard to set up your environment

**launch**
> Launch a training script with the configured settings

**--num_processes** _n_
> Total number of processes to launch

**--gpu_ids** _ids_
> Comma-separated GPU IDs to use

**--mixed_precision** _type_
> Enable mixed precision: no, fp16, bf16

**--num_machines** _n_
> Number of machines for distributed training

**--machine_rank** _n_
> Rank of the current machine (0-indexed)

**--main_process_ip** _ip_
> IP address of the main machine

**--main_process_port** _port_
> Port for the main machine (default: 29500)

**--use_deepspeed**
> Enable DeepSpeed for training

**--use_fsdp**
> Enable Fully Sharded Data Parallel

**test**
> Test your accelerate configuration

**env**
> Print environment information

# CAVEATS

Requires PyTorch to be installed. Configuration should match your actual hardware; mismatches can cause silent failures or crashes. DeepSpeed and FSDP have additional dependencies. Some features require specific GPU architectures (e.g., bf16 requires Ampere or newer).

# HISTORY

**accelerate** was developed by Hugging Face and first released in **2021**. It was created to simplify distributed training and mixed precision workflows, reducing the barrier to training large models on diverse hardware configurations.

# SEE ALSO

[python](/man/python)(1), [torchrun](/man/torchrun)(1), [deepspeed](/man/deepspeed)(1)
