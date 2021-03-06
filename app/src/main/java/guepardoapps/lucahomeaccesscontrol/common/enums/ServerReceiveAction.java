package guepardoapps.lucahomeaccesscontrol.common.enums;

import android.support.annotation.NonNull;

import java.io.Serializable;

public enum ServerReceiveAction implements Serializable {

    NULL(0, ""),
    REQUEST_CODE(1, "REQUEST_CODE"),
    LOGIN_FAILED(2, "LOGIN_FAILED"),
    LOGIN_SUCCESS(3, "LOGIN_SUCCESS"),
    ALARM_ACTIVE(4, "ALARM_ACTIVE"),
    ACTIVATE_ACCESS_CONTROL(5, "ACTIVATE_ACCESS_CONTROL");

    private int _id;
    private String _action;

    ServerReceiveAction(int id, @NonNull String action) {
        _id = id;
        _action = action;
    }

    public int GetId() {
        return _id;
    }

    @Override
    public String toString() {
        return _action;
    }

    public static ServerReceiveAction GetById(int id) {
        for (ServerReceiveAction e : values()) {
            if (e._id == id) {
                return e;
            }
        }

        return NULL;
    }

    public static ServerReceiveAction GetByString(@NonNull String action) {
        for (ServerReceiveAction e : values()) {
            if (e._action.contains(action)) {
                return e;
            }
        }

        return NULL;
    }
}
