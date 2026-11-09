# TAGLINE

Ultralytics YOLO object detection and computer vision CLI

# TLDR

**Run object detection** on an image

```yolo detect predict model=[yolo26n.pt] source=[image.jpg]```

**Train a model** on a custom dataset

```yolo detect train data=[data.yaml] model=[yolo26n.pt] epochs=[100] imgsz=[640]```

**Validate model** accuracy

```yolo detect val model=[best.pt] data=[data.yaml]```

**Export model** to ONNX format

```yolo export model=[best.pt] format=[onnx]```

**Track objects** in video

```yolo detect track model=[yolo26n.pt] source=[video.mp4]```

**Run pose estimation**

```yolo pose predict model=[yolo26n-pose.pt] source=[image.jpg]```

**Benchmark** model performance across export formats

```yolo benchmark model=[yolo26n.pt] imgsz=[640]```

**Resume** an interrupted training run

```yolo detect train resume model=[last.pt]```

Show **environment and dependency** information

```yolo checks```

# SYNOPSIS

**yolo** [_TASK_] _MODE_ [_arg=value_...]

**yolo** **help**|**checks**|**version**|**settings**|**cfg**|**copy-cfg**

# TASKS

**detect**
> Object detection.

**segment**
> Instance segmentation.

**classify**
> Image classification.

**pose**
> Pose estimation.

**semantic**
> Semantic segmentation.

**depth**
> Depth estimation.

**obb**
> Oriented bounding box detection.

# MODES

**train**
> Train a model on a dataset.

**val**
> Validate model accuracy.

**predict**
> Run inference on images, video, or streams.

**export**
> Convert model to deployment formats (ONNX, TensorRT, CoreML, etc.).

**track**
> Multi-object tracking on video.

**benchmark**
> Benchmark model speed and accuracy across export formats.

# PARAMETERS

**model=**_path_
> Model file path (e.g., yolo26n.pt).

**data=**_path_
> Dataset configuration YAML file.

**source=**_path_
> Input source: image, video, directory, URL, or webcam (0).

**epochs=**_n_
> Number of training epochs.

**imgsz=**_size_
> Input image size (default: 640).

**batch=**_n_
> Batch size.

**device=**_id_
> Device: GPU id (0, 0,1) or cpu.

**format=**_fmt_
> Export format: onnx, engine, coreml, tflite, etc.

**conf=**_threshold_
> Confidence threshold for predictions.

# DESCRIPTION

**yolo** is the CLI for Ultralytics YOLO, a state-of-the-art computer vision framework. It provides commands for object detection, instance segmentation, image classification, pose estimation, and oriented bounding box detection from the terminal.

The tool supports a complete workflow: **train** builds models from datasets, **val** evaluates model accuracy, **predict** runs inference on images or video, **export** converts models to deployment formats like ONNX and TensorRT, **track** performs multi-object tracking on video streams, and **benchmark** tests model performance across formats.

Each command accepts an optional task type (detect, segment, classify, pose, obb) and a required mode. Arguments are passed as key=value pairs. Pre-trained models can be used directly for inference or fine-tuned on custom datasets. GPU acceleration is supported through PyTorch.

# CAVEATS

Requires Python and PyTorch. GPU recommended for training. Pre-trained model weights are downloaded automatically on first use. Use `yolo cfg` to view all available configuration arguments. Arguments must use **arg=value** form; `--arg value` and `arg value` are rejected.

# SEE ALSO

[python](/man/python)(1), [pip](/man/pip)(1), [nvidia-smi](/man/nvidia-smi)(1)

# RESOURCES

```[Source code](https://github.com/ultralytics/ultralytics)```

```[Homepage](https://www.ultralytics.com/)```

```[Documentation](https://docs.ultralytics.com/usage/cli/)```

<!-- verified: 2026-11-09 -->
