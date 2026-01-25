# TLDR

**Install PyTorch**

```pip install torch torchvision```

**Check CUDA availability**

```python -c "import torch; print(torch.cuda.is_available())"```

**Check version**

```python -c "import torch; print(torch.__version__)"```

**Run with specific GPU**

```CUDA_VISIBLE_DEVICES=[0] python [script.py]```

# SYNOPSIS

**pytorch** Python library for deep learning

# DESCRIPTION

**PyTorch** is an open-source deep learning framework with dynamic computational graphs. It provides tensor computation with GPU acceleration and automatic differentiation for neural networks.

# BASIC EXAMPLE

```python
import torch
import torch.nn as nn

# Create tensor
x = torch.tensor([[1., 2.], [3., 4.]])

# GPU transfer
if torch.cuda.is_available():
    x = x.cuda()

# Simple model
model = nn.Sequential(
    nn.Linear(10, 64),
    nn.ReLU(),
    nn.Linear(64, 1)
)

# Training loop
optimizer = torch.optim.Adam(model.parameters())
criterion = nn.MSELoss()

for epoch in range(100):
    output = model(input)
    loss = criterion(output, target)
    optimizer.zero_grad()
    loss.backward()
    optimizer.step()
```

# ENVIRONMENT

```bash
# Use specific GPU
CUDA_VISIBLE_DEVICES=0,1 python train.py

# Check GPU memory
python -c "import torch; print(torch.cuda.memory_summary())"
```

# CAVEATS

GPU version requires CUDA. Large library (~2GB). Install from pytorch.org for CUDA version matching.

# HISTORY

PyTorch was developed by **Facebook AI Research** (FAIR), released in 2016 as a successor to Torch (Lua).

# SEE ALSO

[tensorflow](/man/tensorflow)(1), [python](/man/python)(1), [nvidia-smi](/man/nvidia-smi)(1)
