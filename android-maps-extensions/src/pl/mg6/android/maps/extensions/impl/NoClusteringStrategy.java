package pl.mg6.android.maps.extensions.impl;

class NoClusteringStrategy implements ClusteringStrategy {

	@Override
	public void onAdd(DelegatingMarker marker) {

	}

	@Override
	public void onRemove(DelegatingMarker marker) {

	}

	@Override
	public void onPositionChange(DelegatingMarker marker) {

	}

	@Override
	public void onVisibilityChangeRequest(DelegatingMarker marker, boolean visible) {
		marker.changeVisible(visible);
	}
}