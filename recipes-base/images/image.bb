DESCRIPTION = "Marta: full-featured Linux system."

IMAGE_FEATURES += "ssh-server-openssh empty-root-password allow-empty-password"

PREFERRED_VERSION_tar = "1.27.1"
PREFERRED_VERSION_iproute2 = "3.6"

IMAGE_INSTALL = "\
	${CORE_IMAGE_BASE_INSTALL} \
        ${CORE_IMAGE_EXTRA_INSTALL} \
	kernel-devicetree \
	coreutils \
	e2fsprogs \
	logrotate \
	iproute2 \
	iptables \
	v4l-utils \	
	minicom \
	bash \
	icu \
	devmem2 \
	wget \
	bzip2 \
	imx-lib \
	imx-test \
	tar \
	sqlite3 \
	ethtool \
	i2c-tools \
    "


inherit core-image
