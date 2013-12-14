package pointSelection;

import model.DBManager;
import model.Project;
import controller.Core;
import controller.ViewController;

public class PointSelectionController extends ViewController {

	/**
	 * the pointer to the view.
	 */
	public PointSelectionView _view;
	
	public Project project;
	
	public PointSelectionController(Project p) {
		
		super();
		
		this.project = p;
		
		this._view = new PointSelectionView(DBManager.getPictures());
		this._view.setController(this);
	}

	@Override
	public void showView() {
		Core.ViewManager().setView(_view);
	}

}
